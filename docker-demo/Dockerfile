FROM node
ENV NODE_ENV=production
WORKDIR /app
ADD . /app
EXPOSE 3000
RUN npm cache clean --force && npm install 
CMD npm start
