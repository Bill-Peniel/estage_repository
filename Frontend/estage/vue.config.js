
module.exports = {
  devServer: {
    host: '0.0.0.0',
    port: 8080,
    allowedHosts: 'all',
    headers: {
      'Access-Control-Allow-Origin': '*'
    },
    client: {
      webSocketURL: 'auto://0.0.0.0:0/ws'
    },
    historyApiFallback: true,
    hot: true
  }
}
