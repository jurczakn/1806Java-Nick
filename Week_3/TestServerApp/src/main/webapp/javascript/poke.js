function getPokemon(){

    var pId = document.getElementById("pokemansid").value;

    //Step 1. Create XHR
    let xhr = new XMLHttpRequest(); 

    //Step 2. Define function to handle ready state change of the response
    xhr.onreadystatechange = function() {

        if (xhr.readyState === 4 && xhr.status === 200){

            let pokemans = JSON.parse(xhr.responseText);
            
            displayName(pokemans);

        }

    }

    //Step 3. Open XHR
    xhr.open("GET", "https://pokeapi.co/api/v2/pokemon/" + pId, true);

    //Step 4. Send XHR
    xhr.send();

}

function displayName(p){

    document.getElementById("pokemansName").innerHTML = p.name;

}

window.onload = function(){

    document.getElementById("pokemansSubmit").addEventListener("click", getPokemon, false);

}