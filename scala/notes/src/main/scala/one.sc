// define  && and || without using the symbols
def and(x:Boolean, y: =>Boolean) = if(x) y else false
def or(x:Boolean,y: =>Boolean) = if(x) true else y
and(false, true)
// def loop: Boolean = loop
// and(false, loop)
// and(true, loop) ... infinite loop
or(false, false)
or(true, false)