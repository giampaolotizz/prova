# Stage 1 
FROM node:alpine as EventXFront 
WORKDIR /app 
COPY package.json package-lock.json ./ 
RUN npm ci
COPY . .
RUN npm run build -- --prod  
# Stage 2 

FROM bitnami/nginx
RUN chgrp -R root /var/cache/nginx /var/run /var/log/nginx && \ chmod -R 777 /var
RUN npm install
COPY --from=EventXFront /app/dist/EventX /usr/share/nginx/html
RUN sed -i.bak 's/^user/#user/' /etc/nginx/nginx.conf

