<H1>Text Processing and Wrapper Classes</H1>
<h2>String indexing and Parsing</H2>
Ask the user to enter a time in military time (24 hours).
The program should convert and display the equivalent conventional time (12 hour with AM or PM) for
each entry if it is a valid military time.
An error message will be printed to the console if the entry is not a valid military time.

<OL>
  <LI>In Time.java, add conditions that validate the data.
  <OL TYPE="A">
    <LI>Conditions needed:
    <OL TYPE="I">
      <LI> Check the length of the string
      <LI> Check the position of the colon
      <LI> Check that all other characters are digits
    </OL>
  </OL>
  <LI>Add lines that will separate the string into two substrings containing hours and minutes.
    <OL TYPE="A">
      <LI> Convert these substrings to integers and save them into the instance variables.
    </OL>
  <LI> In TimeDemo class, add a condition to the loop that converts the user’s answer to a capital
letter prior to checking it.
  <LI> Compile, debug, and run. Test out your program using the following valid input: 00:00, 12:00,
04:05, 10:15, 23:59, 00:35, and the following invalid input: 7:56, 15:78, 08:60, 24:00, 3e:33,
1:111.
Screenshot of the output TimeDemo.class below:
</OL>
