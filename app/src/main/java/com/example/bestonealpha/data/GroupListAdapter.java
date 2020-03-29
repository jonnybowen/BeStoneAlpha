package com.example.bestonealpha.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bestonealpha.R;
import com.example.bestonealpha.StudyGroup;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class GroupListAdapter extends ArrayAdapter<StudyGroup> {

    private Context mContext;
    int mResource;

    public GroupListAdapter(@NonNull Context context, int resource, @NonNull List<StudyGroup> objects) {
        super(context, resource, objects);
        this.mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the group info
        String name = getItem(position).getGroupName();
        String leader = getItem(position).getLeaderName();
        String nextSession = getItem(position).getNextSession();

        //Create the group object with the information
        StudyGroup sg = new StudyGroup(name, leader, nextSession);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView gName = (TextView) convertView.findViewById(R.id.gav_group_name);
        TextView gLeader = (TextView) convertView.findViewById(R.id.gav_leader);
        TextView gNextSession = (TextView) convertView.findViewById(R.id.gav_nextSession);

        gName.setText(name);
        gLeader.setText(leader);
        gNextSession.setText(nextSession);

        return convertView;
    }
}
