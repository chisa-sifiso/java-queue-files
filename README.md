
<body>
    <h1>Que Application</h1>
    <p>This is a Java application that demonstrates file reading, writing, and using the Queue data structure to manage user input. The application reads a file, counts the number of lines, and allows the user to enter names into a queue. It also writes these names to a file based on whether the number of names entered is less than or equal to the number of lines counted.</p>

  <h2>Features</h2>
    <ul>
        <li>Read lines from a text file and display the content.</li>
        <li>Count the total number of lines in the file.</li>
        <li>Use a queue (<code>Queue&lt;String&gt;</code>) to store user input (names).</li>
        <li>Save the input names to another file, categorizing the users based on the line count.</li>
    </ul>

=    <h2>Technologies Used</h2>
    <ul>
        <li>Java SE</li>
        <li>Swing <code>JFileChooser</code> for file selection</li>
        <li><code>Queue</code> interface and <code>LinkedList</code> class for managing the queue data structure</li>
    </ul>
    <h2>Prerequisites</h2>
    <ul>
        <li>Java Development Kit (JDK) installed</li>
        <li>Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) or a code editor</li>
        <li>Java version 8 or later</li>
    </ul>

  <h2>How to Run</h2>
    <ol>
        <li>Clone the repository to your local machine:
            <pre><code>git clone https://github.com/your-username/que-application.git</code></pre>
        </li>
        <li>Open the project in your Java IDE or code editor.</li>
        <li>Compile and run the <code>Que</code> class.</li>
    </ol>

  <h2>Usage</h2>
    <ol>
        <li>The program will prompt you to select a file to read. Choose any text file, and the application will read and display its contents while counting the number of lines.</li>
        <li>The program will then ask you to input names one by one.</li>
        <li>Names are stored in a queue (<code>Queue&lt;String&gt;</code>) until the number of names matches the number of lines read from the file.</li>
        <li>Once the queue is filled, the program will prompt you to save the queue data to a file.</li>
    </ol>
    <h2>Data Structure Usage</h2>
    <p>This application utilizes a <strong>Queue</strong> (<code>LinkedList&lt;String&gt;</code>), which is an interface implemented by the <code>LinkedList</code> class in Java. The queue is used to store names entered by the user. The program uses the <code>offer()</code> method to add elements to the queue, maintaining the <strong>First-In-First-Out (FIFO)</strong> order. This structure is suitable for handling sequential data where the order of insertion is important, like a waiting list or applicants list.</p>
    <p>The queue is dynamically populated based on the file's line count, ensuring it follows the logic of successful or unsuccessful applicants depending on the number of available spots.</p>

   <h2>Contributions</h2>
    <p>Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.</p>

  <h2>License</h2>
    <p>This project is licensed under the MIT License.</p>
  <h3>Developed by Sifiso Vinjwa </h3>
</body>
</html>
