from tkinter import*
import speedtest

st=speedtest.Speedtest()

def click(event):
    global scvalue
    text=event.widget.cget("text")
    print(text)

    if text=="DownLoad":
        x=float(st.download())
        download_mbs = round(x / (10 ** 6), 2)
        scvalue.set(download_mbs)
        screen.update()


    if text=="UpLoad":
        x=float(st.upload())
        upload_mbs = round(x / (10 ** 6), 2)
        scvalue.set(upload_mbs)
        screen.update()

root =Tk()
root.geometry("300x200")

scvalue=StringVar()
scvalue.set("")
screen=Entry(root,textvar=scvalue,width=60,font='lucide 28')
screen.pack(fill=X,padx=10,pady=10)

b=Button(text='UpLoad',fg='black',padx=10,pady=10,font="algerian 10 bold")
b.pack(side=LEFT,padx=10,pady=10)
b.bind("<Button-1>",click)

b=Button(text='DownLoad',fg='black',padx=10,pady=10,font="algerian 10 bold")
b.pack(side=RIGHT,padx=10,pady=10)
b.bind("<Button-1>",click)

root.mainloop()
