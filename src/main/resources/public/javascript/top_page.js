window.onload = function() {
    var min = 200 ;
    var max = 400 ;
    var elements = document.getElementsByClassName("product");
    for(var i = 0; i < elements.length; i++) {
        var size = Math.floor( Math.random() * (max + 1 - min) ) + min ;
        var img = elements[i].getElementsByTagName('img');
        img[0].style.width = size + "px";
    }
};