/**
 * 
 */

$(document).ready(function(){
	
$('#k').click(function(){
	
	
	/*$.ajax({
		url:"Webservlet",
		type:"POST",
		dataType:"text",
		data:$('#enterusername').serialize(),
		success: function(result){
			//alert(result);
			$('#message').text(result);
			$('#message').slideDown(5000);
			
		},
	
	});*/
	
	var username=$('#username').val();
$.get('Webservlet',{input: username},function(data){
		
		$('#message').html(data);
		$('#message').slideDown();
});
	
		
	
})

	
})