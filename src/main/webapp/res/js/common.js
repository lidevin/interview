//禁右键
document.oncontextmenu=function(e){return false;}
//禁文本选择（复制）
document.onselectstart=function(e){return false;}

//禁用键 作用于Firefox、Opera  
document.onkeypress=doKey;  
//禁用键  作用于IE、Chrome  
document.onkeydown=doKey;  

function doKey(e){  
	var ev = e || window.event;//获取event对象  
	var obj = ev.target || ev.srcElement;//获取事件源  
	var t = obj.type || obj.getAttribute('type');//获取事件源类型  
	//禁用后退键
	if(ev.keyCode == 8 && t != "password" && t != "text" && t != "textarea"){  
		return false;  
	}  
	//禁用shift+F10 （即右键菜单）
	if((ev.shiftKey)&&(ev.keyCode==121)){  
		ev.keyCode=0;    
		return false;  
	} 
}  

