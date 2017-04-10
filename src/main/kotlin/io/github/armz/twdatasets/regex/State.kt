package io.github.armz.twdatasets.regex

data class State (
	var c: Char,
	var transition: State?,
	var transition1: State?
);
