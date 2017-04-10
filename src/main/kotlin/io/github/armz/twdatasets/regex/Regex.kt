package io.github.armz.twdatasets.regex

import java.util.ArrayDeque

class Regex {
	
	fun compile(expr: String): State {
		val stack: ArrayDeque<Fragment> = ArrayDeque<Fragment>();
		var frag: Fragment;
		var frag1: Fragment;
		var frag2: Fragment;

		for (char in expr) {
			when(char) {
				'.' -> {
					frag2 = stack.pop();
					frag1 = stack.pop();
          println("Pop: " + frag1.start);
          println("Pop: " + frag2.start);
					frag1.patch(frag2.start);	
					stack.push(Fragment(frag1.start, frag2.transitions));
				}
				else -> {
					val state: State = State(char, null, null);
          println("Push: " + state);
					stack.push(Fragment(state, arrayOf()));
				}
			}
		}
		frag = stack.pop();
    println(frag.start.c);
		
		val finalState: State = State('f', null, null)
		frag.patch(finalState);

    var st: State? = frag.start;
    while (st != null) {
      println("t0: " + st.transition)
      println("t1: " + st.transition1)
      println("===========");
      st = st.transition;
    }
	
		return frag.start;	
	}
}
