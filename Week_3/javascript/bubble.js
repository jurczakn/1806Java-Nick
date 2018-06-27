function bubble(element) {

    element.style.backgroundColor = "green";
    alert(element.id);
    event.stopPropagation();

}

window.onload = function(){

    document.getElementById("A").addEventListener("click", function(){bubble(this)}, false);
    document.getElementById("B").addEventListener("click", function(){bubble(this)}, false);
    document.getElementById("D").addEventListener("click", function(){bubble(this)}, false);
    document.getElementById("C").addEventListener("click", function(){bubble(this)}, false);
    

}