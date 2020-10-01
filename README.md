# PostgreSQL R2DBC Template Service

A microservice template developed using the reactive stack (WebFlux, R2JDBC, PostgreSQL), containing a Helm chart and ready to be deployed to a Kubernetes, following the general accepted practices of GitOps (Argo CD, GitHub Actions, GitHub Container Registry).

Reactive stack:
-
- Spring Reactive Web (WebFlux)
- R2JDBC (PostgreSQL)

Microservice contains:
-
- Dockerfile
- GitHub Actions
- GitHub Container Registry
- Helm chart
- Distributed trace support (Jaeger)
- Spring security
- Actuator
- Flyway
- Swagger
