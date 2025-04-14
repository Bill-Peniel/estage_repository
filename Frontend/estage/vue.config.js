
module.exports = {
  devServer: {
    port: 8080,
    host: '0.0.0.0',
    allowedHosts: 'all',
    headers: {
      'Access-Control-Allow-Origin': '*',
      'X-UA-Compatible': 'IE=edge',
      'viewport-fit': 'cover'
    },
    historyApiFallback: true,
    hot: true,
    webSocketServer: false
  },
  pages: {
    index: {
      entry: 'src/main.js',
      template: 'public/index.html',
      filename: 'index.html',
      meta: {
        viewport: 'width=device-width, initial-scale=1, shrink-to-fit=no'
      }
    }
  }
}
