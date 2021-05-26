FROM node:alpine AS doserFront
WORKDIR /app
COPY package.json package-lock.json ./
RUN npm ci
COPY . .
RUN npm run build -- --prod

# stage 2

FROM nginx
COPY ./nginx-custom.conf /etc/nginx/conf.d/default.conf
RUN rm -rf /usr/share/nginx/html/ && chmod -R 777 /var/log/nginx /var/cache/nginx/ && chmod -R 777 /etc/nginx/ && chmod -R 777 /var/run/ && chmod -R 777 /usr/share/nginx/
COPY --from=doserFront /app/dist/doser /usr/share/nginx/html
EXPOSE 3001
CMD ["nginx", "-g", "daemon off;"]
