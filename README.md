# Singtel

__Prerequisites__
* Java
* Maven

__Instructions__
1. Please check out the project repository
2. Go to project directory
3. Open a commandline
4. execute __mvn clean install__

__ClassDiagram.jpg__ - for the class Diagram

__Example Output__

<pre>
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.singtel.data.test.AnimalTest
---com.singtel.data.Bird---
I am flying
I am walking
I am singing
I can't swim
---com.singtel.data.Duck---
I am flying
I am walking
Quack , quack
I am swimming
---com.singtel.data.Chicken---
I cannot fly
I am walking
Cluck, cluck
I can't swim
---com.singtel.data.Rooster---
I cannot fly
I am walking
Cock-a-doodle-doo
I can't swim
---com.singtel.data.Parrot---
I am flying
I am walking
I am singing
I can't swim
---com.singtel.data.Shark---
I can't fly
I can't walk
I can't sing
I'm swimming
---com.singtel.data.ClownFish---
I can't fly
I can't walk
I can't sing
I'm swimming
---com.singtel.data.Dolphin---
I can't fly
I can't walk
I'm singing
I'm swimming
---com.singtel.data.Dog---
I can't walking
I am walking
Woof, woof
II'm swimming
---com.singtel.data.Butterfly---
I'm flying
I can't crawl
I can't sing
I can't swim
---com.singtel.data.Butterfly---
I can't fly
I'm crawling
I can't sing
I can't swim
---com.singtel.data.Cat---
I can't fly
I am walking
Meow, Meow
I'm swimming
----------------------------------------
Number of animals that can fly 4
Number of animals that can walk 8
Number of animals that can sing 8
Number of animals that can swim 6
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.174 sec
Running com.singtel.data.test.BirdTest
I am flying
I am singing
I am walking
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec
Running com.singtel.data.test.ButterflyTest
I'm flying
I can't sing
I can't swim
I can't crawl
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running com.singtel.data.test.CaterpillarTest
I can't fly
I can't sing
I can't swim
I'm crawling
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running com.singtel.data.test.ChickenTest
I cannot fly
Cluck, cluck
I am walking
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec
Running com.singtel.data.test.ClownFishTest
I eat dont fish!
I can't fly
I make jokes!
I can't sing
I'm swimming
I can't walk
I'm colour orange
I'm small
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running com.singtel.data.test.DelegateRoosterTest
I cannot fly
Cock-a-doodle-doo
I am walking
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.009 sec
Running com.singtel.data.test.DolphinTest
I can't fly
I can't sing
I'm swimming
I can't walk
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running com.singtel.data.test.DuckTest
I am flying
Quack , quack
I am swimming
I am walking
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running com.singtel.data.test.ParrotTest
----Ordinary Parrot Test----
I am singing
I am walking
I am flying
I can't swim
----Parrot Living with Dog Test----
Woof, woof
I am walking
I am flying
I can't swim
----Parrot Living with Duck Test----
Quack , quack
I am walking
I am flying
I can't swim
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec
Running com.singtel.data.test.RoosterTest
I cannot fly
Cock-a-doodle-doo
I am walking
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec
Running com.singtel.data.test.SharkTest
I eat fish!
I can't fly
I don't make jokes!
I can't sing
I'm swimming
I can't walk
I'm colour grey
I'm HUGE
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.013 sec

Results :

Tests run: 46, Failures: 0, Errors: 0, Skipped: 0

</pre>

__BONUS__
1. Can you add a second language (if you kno w a language other than English) Use the 
rooster as a PoC for demonstrating this. For example, this is how the Rooster sounds 
differently depending on language. Please add the rooster sound in your native tongue.
<pre>
Running com.singtel.data.test.RoosterTest
I cannot fly
Cock-a-doodle-doo
I am walking
kykyliky
kukeleku
kukko kiekuu
cocorico
kikeriki
kikiriki
coo- koo - ri-koo
kukuriku
chicchirichi
ko - ke - kok - ko -o
cucurucu
kukareku
kuckeliku
kuk-kurri-kuuu
kuklooku
tik talaok
Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.074 sec
</pre>

2. Can you design a RESTful API for querying these animals
   __Please refer to the swagger.yaml for the API design__

<pre>
Request: GET http://localhost:8080/Singtel/Animals?type=Bird
Response: 

[{
	"type": "Bird",
	"walk": true,
	"swim": false,
	"fly": true,
	"sing": true
}]

Request: GET http://localhost:8080/Singtel/Animals
Response:
[{
	"type": "Bird",
	"walk": true,
	"swim": false,
	"fly": true,
	"sing": true
}, {
	"type": "Duck",
	"walk": true,
	"swim": true,
	"fly": true,
	"sing": true
}, {
	"type": "Chicken",
	"walk": true,
	"swim": false,
	"fly": false,
	"sing": true
}, {
	"type": "Rooster",
	"walk": true,
	"swim": false,
	"fly": false,
	"sing": true
}, {
	"type": "Parrot",
	"walk": true,
	"swim": false,
	"fly": true,
	"sing": true
}, {
	"type": "Shark",
	"walk": false,
	"swim": true,
	"fly": false,
	"sing": false
}, {
	"type": "ClownFish",
	"walk": false,
	"swim": true,
	"fly": false,
	"sing": false
}, {
	"type": "Dolphin",
	"walk": false,
	"swim": true,
	"fly": false,
	"sing": true
}, {
	"type": "Dog",
	"walk": true,
	"swim": true,
	"fly": false,
	"sing": true
}, {
	"type": "Butterfly",
	"walk": false,
	"swim": false,
	"fly": true,
	"sing": false
}, {
	"type": "Butterfly",
	"walk": true,
	"swim": false,
	"fly": false,
	"sing": false
}, {
	"type": "Cat",
	"walk": true,
	"swim": true,
	"fly": false,
	"sing": true
}]

</pre>
