# idle-robot

A small clojure app to simulate periodically wiggling the mouse to prevent idleness in online games and such.

## Installation

Download from the [github repo][].

[github repo]: http://github.com/psquid/idle-robot

## Usage

For the moment, running idle-robot in a terminal window is _highly_ recommended, as there is presently no way to terminate it other than forcibly halting the process.

To run the app, build the jar with either

    $ lein jar
    
or

    $ lein uberjar
    
then run the resulting jar (produced in the `target` directory) in java with:

    $ java -jar idle-robot-0.1.0[-standalone].jar
    
Alternatively, get the latest standalone snapshot jar from the repo's [downloads][] page, and then use the last command from above, substituting in the name of the file you just downloaded (this option avoids the need to install clojure or leiningen, since everything needed is bundled).

[downloads]: http://github.com/psquid/idle-robot/downloads

## License

Copyright © 2012 Psychedelic Squid

Distributed under the Simplified BSD License. See LICENSE for the full license text.