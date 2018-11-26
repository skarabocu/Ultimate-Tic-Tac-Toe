var turn = "O";
var game = "game5"
$(function() {
$(".btn").click(function(){
    if(this.text === undefined && this.classList[3] === game)
    {
        this.innerHTML = turn;
        this.text = turn;
        if(turn === "O")
            turn = "X";
        else if(turn === "X")
            turn = "O";
        document.getElementById("player_turn").innerText = "Player Turn: "+ turn;
        /* changes the game that will be played next*/
        if(this.classList[2]=== "topLeft"){
            game = "game1";
        }
        else if(this.classList[2] === "topMiddle"){
            game = "game2";
        }
        else if(this.classList[2] === "topRight"){
            game = "game3";
        }
        else if(this.classList[2] === "centerLeft"){
            game = "game4";
        }
        else if(this.classList[2] === "centerMiddle"){
            game = "game5";
        }
        else if(this.classList[2] === "centerRight"){
            game = "game6";
        }
        else if(this.classList[2] === "bottomLeft"){
            game = "game7";
        }
        else if(this.classList[2] === "bottomMiddle"){
            game = "game8";
        }
        else if(this.classList[2] === "bottomRight"){
            game = "game9";
        }
         /******************************************/
       for(var c = 1; c<= 81; c++){
           var buttonID = buttons[c];
           var buttonColor = document.getElementById(buttonID);
           if(buttonColor.classList[3] === game){
               buttonColor.style.backgroundColor = "yellow";
           }
           else{
               buttonColor.style.backgroundColor = "";
           }
       }
    }
});
});