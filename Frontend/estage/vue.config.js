
module.exports = {
  devServer: {
    host: '0.0.0.0',
    port: 8087,
    allowedHosts: 'all',
    headers: {
      'Access-Control-Allow-Origin': '*'
    },
    client: {
      webSocketURL: 'ws://0.0.0.0:8087/ws'
    },
    historyApiFallback: true,
    hot: true
  }
}
