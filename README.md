# Dan Coin
Exploring the creation of currencies of crypto 

This project was a simple project based on the discovery of how crypto currency such as Bitcoin operate.
It's built in Java, and features three main classes.

### Block.java
[Link](./src/Block.java)

This class is very much setup similar to how a node would operate on a linked list. 

It has five main attributes which are the hash of the block, the previous blocks hash, the data the block contains, the timestamp when the block was generated 
and the nonce which is the number of blocks generated.

This class features 3 methods, one being the constructor which takesthe previous hash and the data to be stored.
The next method is the calculate hash which gets the hash fom the block, this is a combination of the nonce, previous hash, timestamp and the data.
The final method is to mine a new block.


----

### DanCoin.java
[Link](./src/DanCoin.java)

This class is the main driver of the application.

This is where the generation of new blocks is started and how the chain is validated.

### StringUtil.java
[Link](./src/StringUtil.java)

This class simply handles the conversion of a string to 256 SHA hash.
