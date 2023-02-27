- Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial is a financial services planning company which works with clients around the world. They want to ensure that their web application is able to securely transmit their clients' information.

- What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

When the vulnerabilities were discovered I implemented a AES cipher to enable symmetric key encryption for Artemis Financial's application. It is important to code securely to avoid putting clients at risk. Software security adds to a company's wellbeing by saving them from the future cost of recovering from security breaches or going back and implementing secure software.

- What part of the vulnerability assessment was challenging or helpful to you?

The part of the vulnerability assesment I found challenging was distinguishing between which results were false positives and which were not.

- How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I increased layers of security by adding an AES cipher. In the future I would use the same vulnerability assessment as a starting point.

- How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

Before making any changes, I noted the existing vulnerabilities. After changes were made, I ran the software to test that the existing functionality still worked and that the new code I wrote had been integrated successfully. I then reran the vulnerability assessment and confirmed no new vulnerabilities were introduced.

- What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

I used the Java Security Standard Algorithm Names to select the cipher used, the Java Keytool to make the certificate for the server, and the Maven Dependency-Check to find vulnerabilities.

- Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would show future employers that I am familiar with the threat assessment process, and that I have experience with creating encryption keys, running and reading the results from vulnerability reports.
