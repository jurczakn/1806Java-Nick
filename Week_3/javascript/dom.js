function makeUser(usr, pwd, burner){

    let user = {};
    user.username = usr;
    user.password = pwd;
    user.isBookBurner = burner;
    return user;

}

function getUser(){

    let usr = document.getElementById("username").value;
    let pwd = document.getElementById("password").value;
    let burner = document.getElementById("burner").checked;
    return makeUser(usr, pwd, burner);

}

function addUser(){

    let usr = getUser();
    let table = document.getElementById("usrtbl");
    let row = document.createElement("tr");
    let usrCol = document.createElement("td");
    let usrPwd = document.createElement("td");
    let usrBrn = document.createElement("td");
    usrCol.innerHTML = usr.username;
    usrPwd.innerHTML = usr.password;
    usrBrn.innerHTML = (usr.isBookBurner) ? "yes" : "i am a good person";

    row.appendChild(usrCol);
    row.appendChild(usrPwd);
    row.appendChild(usrBrn);
    table.appendChild(row);

    

}

window.onload = function(){

    let btn = document.getElementById("myAddUserButtonThatWillBeUsedToAddAUserToMyTableThatIsDirectlyBellowThisButtonButton");
    btn.addEventListener("click", addUser);

  /*   let body = document.getElementsByTagName("body")[0];
    let header = document.createElement("h1");
    header.innerText = "there is now a burning book on this page";
    body.appendChild(header);
    //body.innerHTML = "<h3>there is now a burning book on this page</h3>";
    let image = document.createElement("img");
    image.setAttribute("src", "http://images.mentalfloss.com/sites/default/files/styles/mf_image_16x9/public/153517340.jpg?itok=R8gBUu3H&resize=1100x619");
    image.setAttribute("width", 619);
    image.setAttribute("height", 1100);
    body.appendChild(image); */

}