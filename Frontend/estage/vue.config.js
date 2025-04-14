
module.exports = {
  devServer: {
    host: '0.0.0.0',
    port: 8087,
    allowedHosts: 'all',
    headers: {
      'Access-Control-Allow-Origin': '*'
    },
    public: '0.0.0.0:8087',
    client: {
      webSocketURL: 'auto://0.0.0.0:8087/ws'
    },
    historyApiFallback: true,
    hot: true
  }
}
