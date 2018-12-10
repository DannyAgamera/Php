<!DOCTYPE html>
<html>
<head>
	<title>Chisutia Site</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width-device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="main.css">
	<script type="text/javascript">
		function articleOne() {
			var moreText = document.getElementById('wrapper');
			var article1 = document.getElementById('article1');
			moreText.style.display = "none";
			article1.style.display = "block";
		}
		function articleTwo() {
			var moreText = document.getElementById('wrapper');
			var article2 = document.getElementById('article2');
			moreText.style.display = "none";
			article2.style.display = "block";
		}
		function articleThree() {
			var moreText = document.getElementById('wrapper');
			var article3 = document.getElementById('article3');
			moreText.style.display = "none";
			article3.style.display = "block";
		}
		function articleFour() {
			var moreText = document.getElementById('wrapper');
			var article4 = document.getElementById('article4');
			moreText.style.display = "none";
			article4.style.display = "block";
		}
		function articleFive() {
			var moreText = document.getElementById('wrapper');
			var article5 = document.getElementById('article5');
			moreText.style.display = "none";
			article5.style.display = "block";
		}
		function articleSix() {
			var moreText = document.getElementById('wrapper');
			var article6 = document.getElementById('article6');
			moreText.style.display = "none";
			article6.style.display = "block";
		}
	</script>>
</head>
<body>

	<div id="top">

		<div class="left">
		<h1>CHISUTIA SITE</h1>
		</div>

		<div class="right">
		<ul>
			<li><a href="login.php">Login</a></li>
			<li><a href="#">Sign Up</a></li>
		</ul>
		</div>

	</div>
	<div id="wrapper">
	<section>
		<p id="subtopic">Popular</p>
		<article>
			<img src="messi.png">
			<h3>Title of First Article</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit</p>
			<button onclick="articleOne()" id="myBtn">Read more</button>	
		</article>

		<article>
			<img src="ronaldo.png">
			<h3>Title of Second Article</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit</p>
			<button onclick="articleTwo()" id="myBtn">Read more</button>
		</article>
	</section>
	
	<aside>
		<p id="subtopic">Recent</p>
		<article>
			<h3>Aside Sub-Article One</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit</p>
			<button onclick="articleThree()" id="myBtn">Read more</button>
		</article>
		
		<article>
			<h3>Aside Sub-Article Two</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit</p>
			<button onclick="articleFour()" id="myBtn">Read more</button>
		</article>
		
		<article>
			
			<h3>Aside Sub-Article Three</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit</p>
			<button onclick="articleFive()" id="myBtn">Read more</button>
			
		</article>
		
		<article>
			
			<h3>Aside Sub-Article Four</h3>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit</p>
			<button onclick="articleSix()" id="myBtn">Read more</button>
		</article>	
	</aside>
	
	</div>

	<div id="article1">
		<h3>Title of first article</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit</p>
	</div>


	<div id="article2">
		<h3>Title of second article</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit</p>
	</div>

	<div id="article3">
		<h3>Title of third article</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit</p>
	</div>

	<div id="article4">
		<h3>Title of fourth article</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit</p>
	</div>

	<div id="article5">
		<h3>Title of fifth article</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit</p>
	</div>

	<div id="article6">
		<h3>Title of sixth article</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit orem ipsum dolor sit amet, consectetur adipiscingelit</p>
	</div>

	<footer>
		<ul>
			<li><a href="about.php">About</a></li>
			<li><a href="contact.php">Contact</a></li>
		</ul>
		<p> Copyright 2018</p>
	</footer>

</body>
</html>