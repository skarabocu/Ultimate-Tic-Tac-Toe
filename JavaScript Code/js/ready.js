$("document").ready(function(){
    game = "game5";
    for(var i =1; i<=81;i++){
        var order = buttons[i];
        var button = document.getElementById(order);
        $(button).hide(1);
    }
    for(var a = 1; a<= 81; a++) {
        var currentButton = document.getElementById(buttons[a]);
        $(currentButton).fadeIn(3000);
    }

});

