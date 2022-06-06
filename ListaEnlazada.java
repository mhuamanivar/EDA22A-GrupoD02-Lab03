ublic class ListaEnlazada 
{
    Nodo cabeza;

    public ListaEnlazada()
    {
        cabeza=null;
    }

    public void insertar(String data)
    {
        Nodo aux=new Nodo(data);
        
        if(cabeza==null)
        {
            cabeza=aux;
        }
        else
        {
            Nodo tem=cabeza;
            while(tem.next!=null)
            {
                tem=tem.next;
            }
            tem.next=aux;
        }
    }

    public void recorrido()
    {
        Nodo temp=cabeza;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public boolean buscar(String data)
    {
        Nodo temp= cabeza;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}

