FROM postgres:latest
ENV POSTGRES_PASSWORD=123456
ENV POSTGRES_DB=livro
COPY file.sql /docker-entrypoint-initdb.d/
EXPOSE 5432