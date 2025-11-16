# Enhanced FMC FIX Message Processor

A production-ready, cloud-native platform for processing high-throughput FIX protocol messages in financial markets.

## Features

### Backend (Spring Boot 3.2)
- FIX 4.4 protocol support via QuickFIX/J
- Chronicle Queue for microsecond persistence
- Kafka dynamic routing
- R2DBC reactive PostgreSQL access
- Real-time WebSocket updates
- Production monitoring (Prometheus, Actuator)

### Frontend (React 18 + Material-UI)
- Responsive Material Design UI
- 4 main tabs for workflow
- Real-time WebSocket updates
- Session configuration CRUD
- Message replay functionality
- TypeScript support

### Mock FIX Provider (FINRA CAT)
- NewOrderSingle (MsgType=D) generation
- ExecutionReport (MsgType=8) simulation
- Trade Report (MsgType=AE) for CAT compliance
- QuickFIX/J initiator with auto-reconnect
- Configurable message generation rate

## Quick Start

### Local Development (3 Terminals)

Terminal 1 - Backend:
  cd backend
  mvn clean install
  mvn spring-boot:run

Terminal 2 - Frontend:
  cd frontend
  npm install
  npm run dev

Terminal 3 - Mock Provider:
  cd mock-provider
  mvn clean install
  mvn spring-boot:run

### Docker
  docker-compose up -d

## API Endpoints

- POST /api/fmc/process - Submit FIX message
- GET /api/fmc - List all messages
- POST /api/fmc/{id}/replay - Replay message
- GET /actuator/health - Health check

## License

Apache License 2.0

Version: 1.0.0 | Status: Production Ready
