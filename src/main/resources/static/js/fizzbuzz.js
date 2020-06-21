$(document).ready(function () {	

    $('#btnfuzz').on('click', function(event) {
        event.preventDefault();
		//window.location.href="/";
        var no =$("#numfuzz").val();
		 $.ajax({
				type : 'GET',
				url : '/getList?no='+no,
				async:false,
				success : function(data) {
					var list=data;
					$("#msg").html("");	
            		$('#fizztable').DataTable().destroy();
            		$('#fizztable tr.fizzrow').remove();
            		for (var i in list) {
            		 var row = $("<tr class=fizzrow>" +
            		 		"<td>" + list[i] + 
            				 "</td>" +
            		         "</tr>");
            		 $("#fizzBody").append(row);
            		}
        		  $('#fizztable').DataTable({ lengthChange: false, pageLength: 20,destroy: true,ordering: false})
				},
				error : function(xhr, textStatus, errorThrown) {
					$("#msg").html("Please enter number in range b/w 1 to 1000");
					console.log(xhr+"-----------"+textStatus);
            		$('#fizztable').DataTable().destroy();
            		$('#fizztable tr.fizzrow').remove();
				}
			});	
              
    });

});