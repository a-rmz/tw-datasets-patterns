package io.github.armz.twdatasets.regex

class Fragment (
	var start: State,
	var transitions: Array<State>
) {
	fun appendTransitions(received: Array<State>) {
		this.transitions += received;
    println("Appended list:");
    for (state in transitions) { println(state) }
	}

	fun patch(state: State) {
		this.transitions = arrayOf(state);
	}
}
