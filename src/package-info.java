/**
 “Morra” is a hand game usually played for entertainment or to settle a disagreement. 
 The game has many variations and can be played by two or more players. 

Morra Odds and Evens Variation
In this variation of the game, one player is going to be the “Odds” player and the other player is the “Evens” player. 
In each round of the game, the players will simultaneously hold out between 1 and 10 fingers. 
The winner of the round is decided based on the sum of fingers shown by both players
, namely if the sum is an even number then the “Evens” player wins, otherwise if the sum is an odd number then the “Odds” player wins.
 The winner of the round receives two points.  In addition, the player whose number of fingers is closer to the sum, receives one extra point.
The winner of the game is the first player who accumulates six points. 
<h3> Sample Run </h3>
@author Vinit Date
@author Rajeeva Revankar
@author Carl Mohn
 */
/**
 “Morra” is a hand game usually played for entertainment or to settle a disagreement. 
 The game has many variations and can be played by two or more players. 

Morra Odds and Evens Variation
In this variation of the game, one player is going to be the “Odds” player and the other player is the “Evens” player. 
In each round of the game, the players will simultaneously hold out between 1 and 10 fingers. 
The winner of the round is decided based on the sum of fingers shown by both players
, namely if the sum is an even number then the “Evens” player wins, otherwise if the sum is an odd number then the “Odds” player wins.
 The winner of the round receives two points.  In addition, the player whose number of fingers is closer to the sum, receives one extra point.
The winner of the game is the first player who accumulates six points. 


<h3> Sample Run </h3>

<p>Ola, Do you want to play as Even Or Odd. [Even Num entry selects Even,&nbsp; Odd Num entry selects Odd]<br />Junk<br />Invalid entry, ONLY integer value is accepted <br />-1000<br />I will be positive, discarding negetive part<br /><br />Player&nbsp; : PLYR : Choosen play type&nbsp; : 0<br />Player&nbsp; : CPU : Choosen play type&nbsp; : 1<br /><br />PLYR pick a Number between 1 and 10(Duplicate last Play would be rejected): -1000<br />You entered a negetive value - But I am positve, I will the ignore negetive part<br />You entered a value larger than 10 - Modulated to Base 10.<br />You picked 0, I will replace your play with a random pick<br /><br />Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score&nbsp;&nbsp; &nbsp;Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score<br />1&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;<br />Total Score for PLYR 2<br />Total Score for CPU 1<br /><br />PLYR pick a Number between 1 and 10(Duplicate last Play would be rejected): -1000<br />You entered a negetive value - But I am positve, I will the ignore negetive part<br />You entered a value larger than 10 - Modulated to Base 10.<br />You picked 0, I will replace your play with a random pick<br /><br />Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score&nbsp;&nbsp; &nbsp;Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score<br />1&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;<br />2&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;9&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;0&nbsp;&nbsp; &nbsp;<br />Total Score for PLYR 5<br />Total Score for CPU 1<br /><br />PLYR pick a Number between 1 and 10(Duplicate last Play would be rejected): 3<br /><br />Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score&nbsp;&nbsp; &nbsp;Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score<br />1&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;<br />2&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;9&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;0&nbsp;&nbsp; &nbsp;<br />3&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;0&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;<br />Total Score for PLYR 5<br />Total Score for CPU 4<br /><br />PLYR pick a Number between 1 and 10(Duplicate last Play would be rejected): 3<br />PLYR pick a Number between 1 and 10(Duplicate last Play would be rejected): 4<br /><br />Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score&nbsp;&nbsp; &nbsp;Round&nbsp;&nbsp; &nbsp;Player&nbsp;&nbsp; &nbsp;Play&nbsp;&nbsp; &nbsp;score<br />1&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;<br />2&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;9&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;0&nbsp;&nbsp; &nbsp;<br />3&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;0&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;10&nbsp;&nbsp; &nbsp;3&nbsp;&nbsp; &nbsp;<br />4&nbsp;&nbsp; &nbsp;PLYR&nbsp;&nbsp; &nbsp;4&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;4&nbsp;&nbsp; &nbsp;CPU&nbsp;&nbsp; &nbsp;1&nbsp;&nbsp; &nbsp;2&nbsp;&nbsp; &nbsp;<br />Total Score for PLYR 6<br />Total Score for CPU 6<br /><br />Bingo we have winner as PLYR</p><h2> Process Flow Diagram </h2>
<img alt="Flow Chart" src="FlowChart.jpg" ">


@author Vinit Date
@author Rajeeva Revankar
@author Carl Mohn
 */
