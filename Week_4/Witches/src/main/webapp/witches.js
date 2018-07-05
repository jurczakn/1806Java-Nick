function Witch(){
	
	let w = {};
	w.name = document.getElementById("name").value;
	w.gender = document.getElementById("gender").value;
	w.canFloat = document.getElementById("canFloat").checked;
	w.canHex = document.getElementById("canHex").checked;
	w.witchLevel = document.getElementById("witchLevel").value;
	return w;
	
}

function postWitch(){
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(){
		
		if(xhr.readyState == 4 && xhr.status == 200){
			
			document.getElementById("witchDisplay").innerHTML = "Successfully Posted";
			
		}
	}
	xhr.open("POST", "witch", true);
	xhr.send(JSON.stringify(Witch()));
	
	
	
}

function getWitch(){
	let name = document.getElementById("witchName").value;
	let xhr = new XMLHttpRequest();
xhr.onreadystatechange = function(){
		
		if(xhr.readyState == 4 && xhr.status == 200){
			
			let w = JSON.parse(xhr.responseText);
			
			console.log(w);
			
			document.getElementById("witchDisplay").innerHTML = w;
			
		}
	}
	xhr.open("GET", "witch?name=" + name, true);
	xhr.send();
	
	
}

window.onload = function(){
	
	document.getElementById("search").addEventListener("click", getWitch, false);
	document.getElementById("postWitch").addEventListener("click", postWitch, false);
	
	
}