var image = document.getElementById("main");
var list_img = document.getElementsByClassName("pick-img");
var modalImg = document.getElementsByClassName("modal")[0];
for (var i = 0; i < list_img.length;i++){
    list_img[i].onmouseover = function(){
        image.src = this.src;
    }
}
// open modal
image.addEventListener("click", function(){
    // console.log("click");
    document.getElementById("main2").setAttribute("src", this.getAttribute("src"));

    modalImg.classList.add("active");
})
// remove modal
modalImg.addEventListener("click", function(e){
        modalImg.classList.remove("active");
})

