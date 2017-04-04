package io.github.armz.twdatasets

import io.github.armz.twdatasets.tweet.Tweet

class Main {
  fun main() {
    val tw = Tweet("Hello, tweet!")
    println(tw)
  } 
}

fun main(args: Array<String>) {
  Main().main()
}
