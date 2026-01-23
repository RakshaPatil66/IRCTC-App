# 🚂 Railway Reservation System (IRCTC Clone)

A lightweight, efficient Java application that simulates the core functionalities of a railway booking system. This project demonstrates backend logic implementation and efficient data manipulation using **Java Collections (HashMap)** for high-performance, in-memory data storage.

## 🚀 Features

* **Book Tickets:** Users can book tickets by providing passenger details. The system generates a unique Ticket ID and saves the booking instantly.
* **View All Tickets:** Retrieves all booked tickets from the system efficiently.
* **In-Memory Storage:** Uses `HashMap` to store ticket data, ensuring O(1) time complexity for retrieval operations.
* **No Database Required:** The application runs entirely on Java, making it easy to set up and test without external database dependencies.

## 🛠️ Tech Stack

* **Language:** Java
* **Data Structure:** HashMap (Key: Ticket ID, Value: Ticket Object)
* **Architecture:** Modular (Service Layer, Model Layer)

## 💻 Code Logic (HashMap Implementation)

Instead of a traditional database, this project leverages the power of **HashMaps** for temporary storage. This simulates a "Ticket Provider" service.

**Why HashMap?**
* **Performance:** Lookup and Insertion operations are extremely fast (Time Complexity: O(1)).
* **Simplicity:** Removes the overhead of setting up MySQL/PostgreSQL for a prototype application.

### Snippet: Storing Data
```java
private Map<Integer, Ticket> ticketDb = new HashMap<>();

public Ticket bookTicket(Ticket ticket) {
    ticketDb.put(ticket.getTicketId(), ticket);
    return ticket;
}
