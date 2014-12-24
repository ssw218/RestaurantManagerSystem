var show = true;
function onTrClick() {
	if(show) {
		$(this).css("background-color", "#228b22");
		$(this).css("opacity", 0.5);
		$("#add").hide();
		$("tr[name='button']").hide();
		$("#letter").css("font-weight", "blod");
		$("#table_close").fadeOut();
		$("#table_close").slideUp();
		show = false;
	}
	else {
		$(this).css("background-color", "#2e8b57");
		$(this).css("opacity", 1);
		$("#add").show();
		$("td[class='button']").show();
		$("#letter").css("font-weight", "lighter");
		$("#table_close").fadeIn();
		$("#table_close").slideDown();
		show = true;
	}
}
$("#table_click").click(onTrClick);