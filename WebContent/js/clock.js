function updateClock() {
	var date = new Date();
	var hour = date.getHours();
	if(hour < 10) hour = "0" + hour;
	var minute = date.getMinutes();
	if(minute < 10) minute = "0" + minute;
	var second = date.getSeconds();
	if(second < 10) second = "0" + second;
	var string = hour + ":" + minute + ":" + second;
	window.document.getElementById("clock").innerHTML = string;
}
updateClock();
window.setInterval("updateClock()", 1000);