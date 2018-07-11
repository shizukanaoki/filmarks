window.onload = function() {
    var min = 100 ;
    var max = 200 ;
    var elements = document.getElementsByClassName("product");
    for(var i = 0; i < elements.length; i++) {
        var size = Math.floor( Math.random() * (max + 1 - min) ) + min ;
        var img = elements[i].getElementsByTagName('img');
        img[0].style.width = size + "px";
    }
};