
function ptb1(a, b) {
    var a = prompt("nhập a")
    var b = prompt("nhập b")
    if (a == 0) {
        if (b == 0) {
            alert("Phương trình vô số nghiệm");
        } else {
            alert( "Phương trình vô nghiệm");
        }
    } else {
        alert ("Phương trình có nghiệm x = " + (-b / a));
    }
}

x = sumAll(1,23,500,115,44,88);
function sumAll(){
    var i,sum = 0;
    for (i = 0; i <arguments.length; i++){
        sum += arguments[i];
    }
    alert("Tổng các số là: " + sum);
}