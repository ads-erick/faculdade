from flask import Flask, render_template, request
app = Flask(__name__)
nomes = []
@app.route("/", methods=["GET", "POST"])
def main():
    if request.form.method == "POST":
        if request.form.get("nome"):
            nomes.append(request.fomr.get("nome"))
    return render_template("index.html", nomes=nomes)

if __name__ == "__main__":
    app.run(debug=True)