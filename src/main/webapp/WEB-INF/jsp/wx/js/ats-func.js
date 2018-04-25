/* 
 * ATS通用JS函数
 * 
 * ChenGuang
 * 2013-07-25
 */

//打开窗口
function openWin(URL, WWidth, WHeight, Scroll){  
	var WLeft = Math.ceil((window.screen.width - WWidth) / 2 ); 
	var WTop = Math.ceil((window.screen.height - WHeight) / 2 )-50; 
	var features =
	'width='  + WWidth  + 'px,' +
	'height=' + WHeight  + 'px,' +
	'left='   + WLeft  + 'px,' +
	'top='    + WTop  + 'px,' +
	'fullscreen=0, toolbar=0, location=0, directories=0, status=0, menubar=0, scrollbars=' + Scroll + ', resizable=1';
	window.open(URL, "", features);
}