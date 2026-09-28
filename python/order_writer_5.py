import psycopg2


def save_customer_5(email, first_name):
    conn = psycopg2.connect(host="orders-db", port=5432, dbname="orders", user="orders", password="orders")
    cur = conn.cursor()
    cur.execute("INSERT INTO customers (email, first_name) VALUES (%s, %s)", (email, first_name))
    conn.commit()
    conn.close()
