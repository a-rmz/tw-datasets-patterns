package io.github.armz.twdatasets

import io.github.armz.twdatasets.tweet.Tweet
import io.github.armz.twdatasets.regex.Regex

class Main {
  fun main() {
		var regex: Regex = Regex()
		var state = regex.compile("ab.")
		println("Initial char: " + state.c)
  } 
}

fun main(args: Array<String>) {
  Main().main()
}
