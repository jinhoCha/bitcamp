//div#header 태그에 /html/header.html 내용을 삽입한다.
$.get("/challenge-project/html7/header/html/header_black_login.html", (data) => {
	$("#header").html(data);
});