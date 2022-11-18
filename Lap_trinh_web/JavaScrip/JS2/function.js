var image = document.getElementById("main");
var list_img = document.getElementsByClassName("pick-img");
for (var i = 0; i < list_img.length;i++){
    list_img[i].onmouseover = function(){
        image.src = this.src;
    }
}