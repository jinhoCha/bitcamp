	$("#loginBtn").click(() => {
		
		console.log($("#fId").val())
		console.log($("#fPassword").val())
		
	    var data = {
	        id : $("#fId").val(),
	        password: $("#fPassword").val()
	    };
		
		console.log(data);
		
	    if ($(document.body).is("#fSaveId:checked")) {
	        data.saveId = "true";
	    }
	    $.post("../../../json/auth/login", data, (result) => {
	        if (result.state == "success")
	            location.href = "../main/main.html";
	        else 
	            window.alert("로그인 실패!");
	    }, "json");
	});