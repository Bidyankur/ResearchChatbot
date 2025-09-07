# Academic Research Chatbot

A full-stack web application where students and researchers can **chat with uploaded academic papers**. Built with **Spring Boot (backend)** and **React + Vite (frontend)**.

***

## 🚀 Features

- Upload PDF research papers
- Store metadata in a PostgreSQL database
- Ask questions in natural language and get contextual answers
- Simple, intuitive web interface

***

## 🛠️ Tech Stack

- **Backend**: Spring Boot (Java 17+), PostgreSQL, Hibernate, REST APIs
- **Frontend**: React (Vite, JavaScript), Tailwind CSS
- **Database**: PostgreSQL

***

## 📂 Project Structure

```
academic-research-chatbot/
├── backend/            # Spring Boot backend
│   ├── src/main/java/  # Java source files
│   ├── src/main/resources/
│   └── pom.xml         # Maven config
│
├── frontend/           # React + Vite frontend
│   ├── public/
│   ├── src/
│   ├── package.json
│   └── vite.config.js
│
└── README.md           # Project documentation
```

***

## ⚙️ Setup Instructions

### 1. Clone the repo

```bash
git clone https://github.com/your-username/academic-research-chatbot.git
cd academic-research-chatbot
```

### 2. Database Setup (PostgreSQL)

Create a database named `research_chatbot`:

```sql
CREATE DATABASE research_chatbot;
```

Then create a table for storing uploaded papers:

```sql
CREATE TABLE papers (
  id SERIAL PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  author VARCHAR(255),
  upload_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  file_path VARCHAR(500) NOT NULL
);
```

Update `backend/src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/research_chatbot
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Backend Setup (Spring Boot)

```bash
cd backend
./mvnw spring-boot:run
```

Backend runs on: **http://localhost:8080/**

### 4. Frontend Setup (React + Vite)

```bash
cd frontend
npm install
npm run dev
```

Frontend runs on: **http://localhost:3000/**

***

## 🌐 API Endpoints

| Method | Endpoint        | Description                |
|--------|----------------|----------------------------|
| GET    | `/api/papers`  | Fetch all uploaded papers  |
| POST   | `/api/papers`  | Upload a new paper         |
| POST   | `/api/chat`    | Send a question to chatbot |

***

## 📌 Future Enhancements

- PDF parsing and text extraction
- AI-powered summarization & QnA (OpenAI / HuggingFace integration)
- User authentication
- Citation graph visualization

***
