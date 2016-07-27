package main.scala

object forTranslation {
  //
	// Translate the for comprehension in HO functions
	//
	// 1 - for with 1 generator translate to a map...
	for (x <- e1) yield e2
	e1.maps(x => e2)
	
	// 2 - for with generator and filter
	for(x <- e1 if f; s) yield e2
	// we can expand like this, usign the withFilter (lazy eval Filter) function
	for(x <- e1.withFilter(x => f); s) yield e2

	// 3 - 2 generator, translate to flaptMap
	for{
		x <- e1
		y <- e2;
		s
		) yield e3
	// or I can write it on one line only
	for(x <- e1; y <- e2; s) yield e3
	//
	e1.flatMap(x => for (y <- e2; s) yield e3)
	// one step further
	e1.flatMpa(x => e2.map(y => s; e3))
	
	for {
		i <- 1 until n
		j <- 1 until i
		if isPrime(i+j)
	} yield (i, j)

	// this translate to HO functions
	(1 until n).flatMap ( i =>       // genreators
		(1 until i).withFilter(j => isPrime(i+j))  // condition, filters
		.map(j => (i, j)))  // map for the yield

	// exercise
	for (b <- books, a <- b.authors if a startWith "Scala") yield b.title
	// translatation in HO functions
	books.flatMap(b => b.authors.withFilter(a => a.startWith "Scala").map(a => b.title))
	

	// starting with ...
	opt flatMap f flatMap g
	// 1) I can rewrite lie this...
	opt match { case Some(x) => f(x) case None => None }
		 match { case Some(y) => g(y) case None => None }
	// 2) expand  into ...
	opt match {
		case Some(x) =>
			f(x) match {
				case Some(y) => g(y)
				case None => None
			}
		case None =>
			None match {
				case Some(y) => g(y)
				case None => None
			}
	}
	// 3) simplify in...
	opt match  {
		case Some(x) =>
			f(x) match {
				case Some(y) => g(y)
				case None => None
			}
		case None => None
	// 4) and finally to ...
	opt match {
		case Some(x) => f(x) flatMap g
		case None => None
	}
	
}