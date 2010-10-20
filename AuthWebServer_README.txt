
Your goal in this lab is to write a password manager for a simple web server.
The AuthWebServer.java file contains a slightly more built out web server
than SimpleWebServer.java.  The simple web server has been instrumented to
accept user registration and login requests.  The web server uses a class
called PasswordManager to create new users in the system, and authenticate
users when they attempt to login.  We have provided some code for the 
password manager that handles storing and loading a password file to and
from disk, but have left some of the methods/functions in the password
manager class unimplemented for you to code.  Please keep in mind everything
that you learned in the lectures earlier today when implementing the password
manager, and be careful to "use crypto correctly."


After you have successfully compiled your code, you can test out 
your new password manager as part of the web server by running:

java AuthWebServer <port-number> <password>

Set your CLASSPATH to compile

export CLASSPATH=".:$CLASSPATH"


Example compilation:

javac com/learnsecurity/*.java


The first time that you run AuthWebServer, it will complain that it may
issue a warning saying that it may not be able to load 
the password file.  This is because initially there may be no password
file.  


Upon successfully coding the PasswordManager, you should be able to
do the following:

1) Register a new user, and assign an image to that user.
2) Confirm that logging in with an incorrect username/password combination fails.
3) Succesfullly login with a correct username/password combination.
4) Check that the htpasswd file is being stored in encrypted (not just encoded) format.
5) Conduct an image login in which you can verify the image assigned to you prior to logging in.

Notes:

* For the purposes of this lab, you do not have to worry about supporting SSL or secure cookies.


Extra Credit:

** Modify the code so that you can't register someone else's account.
** Modify the code so that you can't choose a blank password.

