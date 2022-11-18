var btn = document.getElementsByClassName("btn");
var new1 = document.getElementsByClassName("new");
var sale = document.getElementsByClassName("sale");
var run = document.getElementsByClassName("run");
var hiden = document.getElementsByClassName("content");
for (var i = 0; i < hiden.length;i++){
    hiden[i].style.display = "none";
}


for (var i = 0; i < btn.length; i++) {
    btn[i].addEventListener("click", function () {
        if (i == 0){
            console.log("0");
        }
    });
}