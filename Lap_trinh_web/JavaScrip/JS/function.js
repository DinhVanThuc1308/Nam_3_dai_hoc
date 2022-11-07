


// function ptb1(a,b)
// {
//     var a = document.getElementById('a').value;
// var b = document.getElementById('b').value;
// var result = document.getElementsByClassName('mybox')[0];
// a=Number(a);
// b=Number(b);
//     if (a == 0 && b == 0) {
//         result.innerHTML='Phuong trinh vo so nghiem';
//     } else if (a != 0 && b == 0) {
//         result.innerHTML='Phương trình có nghiệm x = 0';
//     } else if (a == 0 && b != 0) {
//         result.innerHTML="Phương trình vô nghiệm";
//     } else {
//         result.innerHTML='Phương trình' +a+'x +'+b+'  có nghiệm x = ' + (-b / a);
//     }
// }
// // caculator
// function caculator() {
//     var result = document.querySelectorAll('.btn1')
//         for (var i = 0; i < btn.length; i++) {
//             btn[i].onclick = function() {
//                 thisObject.values(input.innerHTML);

numbers = document.querySelectorAll('.btn')
result = document.getElementById('result')

for (var i = 0; i < numbers.length; i++) {
    numbers[i].onclick = function() {
        result.value += this.value
    }
}

equal = document.getElementsByClassName("equal")[0]
equal.addEventListener("click",function() {
    result.value = eval(result.value)
})

clear = document.getElementsByClassName("clear")[0]
clear.addEventListener("click",function() {
    result.value= ""
})




        








