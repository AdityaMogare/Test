from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/addition/<int:a>/<int:b>', methods=['GET'])
def add(a, b):
    result = a + b
    return jsonify({"result": result})

if __name__ == '__main__':
    app.run(debug=True)
